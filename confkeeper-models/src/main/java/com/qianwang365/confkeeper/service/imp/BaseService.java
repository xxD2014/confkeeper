/**
 * 
 */
package com.qianwang365.confkeeper.service.imp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qianwang365.confkeeper.dao.IBaseMapperDao;
import com.qianwang365.confkeeper.service.IBaseService;
import com.qianwang365.confkeeper.utils.Pagination;

/**
 * @author Yate
 * @date 2013年9月23日
 * @description 基础的
 * @version 1.0
 */
public abstract class BaseService<E, PK> implements IBaseService<E, PK> {
	protected final Logger log = LoggerFactory.getLogger(this.getClass());

	protected abstract IBaseMapperDao<E, PK> getMapperDao();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.yate.basic.service.IBaseService#add(java.lang.Object)
	 */
	public void add(E e) {
		this.getMapperDao().add(e);
<<<<<<< HEAD
		System.out.println(e);
=======
>>>>>>> 0ed04841feb04ddb0dfb8f44d2a00f68437ce55b
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.yate.basic.service.IBaseService#remove(java.lang.Object)
	 */
	public void remove(PK id) {
		this.getMapperDao().remove(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.yate.basic.service.IBaseService#update(java.lang.Object)
	 */
	public void update(E e) {
		this.getMapperDao().update(e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.yate.basic.service.IBaseService#getEntities(int, int,
	 * java.lang.String, java.lang.String)
	 */
	public Pagination<E> getEntities(int page, int rows, E e) {
		Pagination<E> result = new Pagination<E>(page, rows);
		result.setRows(this.getMapperDao().getEntities(result, e));
		return result;
	}

<<<<<<< HEAD
	@Override
	public Pagination<E> getEntities(E e) {
		Pagination<E> result = new Pagination<E>(1, Integer.MAX_VALUE);
		result.setRows(this.getMapperDao().getEntities(result, e));
		return result;
	}

=======
>>>>>>> 0ed04841feb04ddb0dfb8f44d2a00f68437ce55b
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.yate.basic.service.IBaseService#getEntity(java.lang.Object)
	 */
	public E getEntity(PK id) {
		return this.getMapperDao().getEntity(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.qianwang365.confkeeper.service.IBaseService#batchAdd(java.util.List)
	 */
	public void batchAdd(List<E> e) {
		this.getMapperDao().batchAdd(e);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.qianwang365.confkeeper.service.IBaseService#batchRemove(java.util
	 * .List)
	 */
	public void batchRemove(PK[] ids) {
		this.getMapperDao().batchRemove(ids);
	}

}
