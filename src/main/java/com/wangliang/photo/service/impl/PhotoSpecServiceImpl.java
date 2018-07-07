package com.wangliang.photo.service.impl;

import com.wangliang.photo.dao.PhotoSpecDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangliang
 */
@Service
public class PhotoSpecServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(PhotoSpecServiceImpl.class);

    @Resource
    private PhotoSpecDao photoSpecDao;



}
