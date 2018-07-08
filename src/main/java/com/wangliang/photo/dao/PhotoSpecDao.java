package com.wangliang.photo.dao;

import com.wangliang.photo.model.po.PhotoSpecPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    @Select("select * from photo_spec where id = #{photoSpecId}")
    PhotoSpecPO queryPhotoSpecById(int photoSpecId);


    /**
     * 更新照片规格
     *
     * @param photoSpecPO
     * @return
     */
    @Update("update photo_spec set name = #{name}, color = #{color}, mm_size = #{mmSize}, pixel_size = #{pixelSize}, dpi = #{dpi}, type = #{type}, create_time = #{createTime}")
    int updatePhotoSpec(PhotoSpecPO photoSpecPO);


    /**
     * 删除照片规格
     *
     * @param photoSpecId
     * @return
     */
    @Delete("delete from photo_spec where id = #{photoSpecId}")
    int deletePhotoSpec(int photoSpecId);
}
