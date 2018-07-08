package com.wangliang.photo.service;

import com.wangliang.photo.model.po.PhotoSpecPO;
import com.wangliang.photo.model.vo.PhotoSpecVO;

import java.util.List;

/**
 * @author wangliang
 */
public interface PhotoSpecService {

    /**
     * 根据id搜索
     *
     * @param photoSpecId
     * @return
     */
    PhotoSpecVO queryPhotoSpecById(int photoSpecId);

    /**
     * 根据type搜索
     *
     * @param type
     * @return
     */
    List<PhotoSpecVO> queryByType(int type);
}
