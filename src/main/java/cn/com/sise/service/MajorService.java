package cn.com.sise.service;

import cn.com.sise.dao.MajorDao;
import cn.com.sise.pojo.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :hhyygg2009
 * @date :Created in  2021/4/13 9:08
 */
@Service
public class MajorService {

    //    @Qualifier("majorImpl")
    @Autowired
    MajorDao majorDao;

    public List<Major> selectMajor() {
        int i = 1 / 0;
        return majorDao.selectAllMajor();
    }
}
