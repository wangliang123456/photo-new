package com.wangliang.photo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wangliang.photo.model.vo.PhotoSpecVO;
import com.wangliang.photo.service.PhotoSpecService;

/**
 * @author wangliang
 *
 */
@RestController
@RequestMapping("/photo")
public class PhotoSpecController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PhotoSpecController.class);

    @Resource
    private PhotoSpecService photoSpecService;


    @GetMapping("/query")
    public PhotoSpecVO queryPhotoSpec(@RequestParam int photoSpecId) {
        LOGGER.info("查询参数为{}",photoSpecId);
        return photoSpecService.queryPhotoSpecById(photoSpecId);
    }

    @GetMapping("/type")
    public List<PhotoSpecVO> queryByType(@RequestParam int type) {
        LOGGER.info("查询参数为{}",type);
        return photoSpecService.queryByType(type);
    }
}