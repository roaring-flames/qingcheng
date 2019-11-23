package com.qingcheng.service.goods;

import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

/**
 * brand业务逻辑层
 */
public interface BrandService {

    /**
     * 查询所有品牌：不分页
     *
     * @return
     */
    List<Brand> findAll();

   /* List<Brand> findname();*/


    /**
     * 查询所有品牌：分页
     *
     * @return
     */
    /*public PageResult<Brand> findPage(int page, int size);


    public List<Brand> findList(Map<String, Object> searchMap);

    public PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size);


    public Brand findById(Integer id);

    public void add(Brand brand);


    public void update(Brand brand);


    public void delete(Integer id);*/

}
