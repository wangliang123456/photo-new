package com.wangliang.photo.service.impl;

import com.wangliang.photo.dao.PhotoSpecDao;
import com.wangliang.photo.model.po.PhotoSpecPO;
import com.wangliang.photo.service.PhotoSpecService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author wangliang
 */
@Service
public class PhotoSpecServiceImpl implements PhotoSpecService {

    private static final Logger LOG = LoggerFactory.getLogger(PhotoSpecServiceImpl.class);

    @Resource
    private PhotoSpecDao photoSpecDao;


    @Override
    public PhotoSpecPO queryPhotoSpecById(int photoSpecId) {
        if (photoSpecId == 0) {
            return null;
        }
        return photoSpecDao.queryPhotoSpecById(photoSpecId);
    }
}
