package com.wangliang.photo.dao;

import com.wangliang.photo.model.po.PhotoSpecPO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author wangliang
 */
@Mapper
public interface PhotoSpecDao {

    /**
     * 根据id查询照片规格
     *
     * @param photoSpecId
     * @return
     */
    PhotoSpecPO queryPhotoSpecById(@Param("photoSpecId") int photoSpecId);


    /**
     * 更新照片规格
     *
     * @param photoSpecPO
     * @return
     */
    int updatePhotoSpec(@Param("obj") PhotoSpecPO photoSpecPO);


    /**
     * 删除照片规格
     *
     * @param photoSpecId
     * @return
     */
    int deletePhotoSpec(@Param("photoSpecId") int photoSpecId);

    /**
     * 查询所有
     *
     * @param type
     * @return
     */
    List<PhotoSpecPO> queryAllRecord(@Param("type") int type);
}
