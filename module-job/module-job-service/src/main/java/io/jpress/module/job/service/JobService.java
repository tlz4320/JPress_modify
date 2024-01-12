package io.jpress.module.job.service;

import com.jfinal.plugin.activerecord.Page;
import io.jpress.module.job.model.Job;
import io.jboot.db.model.Columns;

import java.util.List;

public interface JobService  {

    /**
     * 根据主键查找Model
     *
     * @param id
     * @return
     */
    public Job findById(Object id);


    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @return
     */
    public Job findFirstByColumns(Columns columns);

    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public Job findFirstByColumns(Columns columns, String orderBy);


    /**
     * 查找全部数据
     *
     * @return
     */
    public List<Job> findAll();


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @return
     */
    public List<Job> findListByColumns(Columns columns);


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public List<Job> findListByColumns(Columns columns, String orderBy);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param count
     * @return
     */
    public List<Job> findListByColumns(Columns columns, Integer count);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @param count
     * @return
     */
    public List<Job> findListByColumns(Columns columns, String orderBy, Integer count);


    /**
     * 根据提交查询数据量
     *
     * @param columns
     * @return
     */
    public long findCountByColumns(Columns columns);


    /**
     * 根据ID 删除model
     *
     * @param id
     * @return
     */
    public boolean deleteById(Object id);


    /**
     * 删除
     *
     * @param model
     * @return
     */
    public boolean delete(Job model);


    /**
     * 根据 多个 id 批量删除
     *
     * @param ids
     * @return
     */
    public boolean batchDeleteByIds(Object... ids);


    /**
     * 保存到数据库
     *
     * @param model
     * @return id if success
     */
    public Object save(Job model);


    /**
     * 保存或更新
     *
     * @param model
     * @return id if success
     */
    public Object saveOrUpdate(Job model);

    /**
     * 更新
     *
     * @param model
     * @return
     */
    public boolean update(Job model);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Job> paginate(int page, int pageSize);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<Job> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return
     */
    public Page<Job> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


    /**
    * 分页查询并且添加信息
    *
    * @param pagePara
    * @param pageSizePara
    * @return com.jfinal.plugin.activerecord.Page<io.jpress.module.job.model.Job>
    */
    Page<Job> paginateByColumnsWithInfo(int pagePara, int pageSizePara,Columns columns, String orderBy);

    /**
    * 根据id 查询 job 对象 并添加信息
    *
    * @param id
    * @return io.jpress.module.job.model.Job
    */
    public Job findByIdWithInfo(Long id);

    /**
    * 根据各种条件查询 job
    *
    * @param columns
    * @param orderBy
    * @return java.util.List<io.jpress.module.job.model.Job>
    */
    List<Job> findListByColumnsWithInfo(Columns columns, String orderBy,Integer count);
}