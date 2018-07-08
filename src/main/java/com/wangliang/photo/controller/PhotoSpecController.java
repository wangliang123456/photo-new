package com.wangliang.photo.controller;

import com.wangliang.photo.model.po.PhotoSpecPO;
import com.wangliang.photo.model.vo.PhotoSpecVO;
import com.wangliang.photo.service.PhotoSpecService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
        return photoSpecService.queryPhotoSpecById(photoSpecId);
    }

    @GetMapping("/query/type")
    public List<PhotoSpecVO> queryByType(@RequestParam int type) {
        return photoSpecService.queryByType(type);
    }
}
