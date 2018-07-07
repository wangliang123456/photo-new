package com.wangliang.photo.dao;

import com.wangliang.photo.model.po.PhotoSpecPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PhotoSpecDao {

    /**
     * 根据id查询照片规格
     *
     * @param photoSpecId
     * @return
     */
    @Select("select * from photo_spec where id = #{photoSpecId}")
    PhotoSpecPO queryPhotoSpecById(int photoSpecId);
}
