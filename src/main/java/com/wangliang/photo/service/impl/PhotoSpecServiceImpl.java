package com.wangliang.photo.service.impl;

import com.google.common.collect.Lists;
import com.wangliang.photo.dao.PhotoSpecDao;
import com.wangliang.photo.model.po.PhotoSpecPO;
import com.wangliang.photo.model.vo.PhotoSpecVO;
import com.wangliang.photo.service.PhotoSpecService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author wangliang
 */
@Service
public class PhotoSpecServiceImpl implements PhotoSpecService {

    private static final Logger LOG = LoggerFactory.getLogger(PhotoSpecServiceImpl.class);

    @Resource
    private PhotoSpecDao photoSpecDao;


    @Override
    public PhotoSpecVO queryPhotoSpecById(int photoSpecId) {
        PhotoSpecVO photoSpecVO = null;
        if (photoSpecId == 0) {
            return photoSpecVO;
        }
        PhotoSpecPO photoSpecPO = photoSpecDao.queryPhotoSpecById(photoSpecId);
        if (Objects.nonNull(photoSpecPO)) {
            photoSpecVO = new PhotoSpecVO();
            BeanUtils.copyProperties(photoSpecPO, photoSpecVO);
        }
        return photoSpecVO;
    }

    /**
     * 根据type搜索
     *
     * @param type
     * @return
     */
    @Override
    public List<PhotoSpecVO> queryByType(int type) {
        List<PhotoSpecPO> photoSpecPOList = Lists.newArrayList();
        List<PhotoSpecVO> photoSpecVOList = Lists.newArrayList();
        photoSpecPOList = photoSpecDao.queryAllRecord(type);
        if (CollectionUtils.isNotEmpty(photoSpecPOList)) {
            photoSpecVOList = photoSpecPOList.stream().map(photoSpecPO -> {
                PhotoSpecVO photoSpecVO = new PhotoSpecVO();
                BeanUtils.copyProperties(photoSpecPO, photoSpecVO);
                return photoSpecVO;
            }).collect(Collectors.toList());
        }
        return photoSpecVOList;
    }
}
