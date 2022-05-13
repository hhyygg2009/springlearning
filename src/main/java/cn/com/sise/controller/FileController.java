package cn.com.sise.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author: hhyygg2009
 * @date: Created in 2021/4/26 11:23
 */
@Controller
@RequestMapping("/file")
@MultipartConfig
public class FileController {

    String path="./tmp/";

    @GetMapping("/upload")
    public String fileupload(Model model){
        List<String> fileList=new ArrayList<>();
        File paths = new File(path);
        for (File f : paths.listFiles()){
            fileList.add(f.getName());
        }
        model.addAttribute("files",fileList);


        return  "/stu/stuFile";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("photo")MultipartFile file, Model model){
        File newFile=new File(path+file.getOriginalFilename());
        try {
            file.transferTo(newFile);
            System.out.println(newFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect: /stu/stuFile";
    }

    @GetMapping("/download/{name}")
    public ResponseEntity<byte[]> download(@PathVariable("name") String name){
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment",new String(name.getBytes(StandardCharsets.UTF_8),StandardCharsets.ISO_8859_1));
        File file=new File(path+name);

        try (InputStream inputStream = new FileInputStream(file)) {
            byte[]   b=new byte[inputStream.available()];
          inputStream.read(b);
            return new ResponseEntity<byte[]>(b,headers, HttpStatus.OK);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;


    }

}
