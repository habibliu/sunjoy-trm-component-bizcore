package com.sunjoy.trm.bizcore.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.github.jsonzou.jmockdata.JMockData;
import com.github.jsonzou.jmockdata.MockConfig;
import com.sunjoy.trm.bizcore.dao.dto.RegistionDto;
import com.sunjoy.trm.bizcore.dao.entity.Registion;
import com.sunjoy.trm.bizcore.service.IRegistionService;
import com.sunjoy.trm.config.AbstractUnitTestSupport;
import com.sunjoy.trm.master.dao.entity.Course;
import com.sunjoy.trm.master.service.ICourseService;

/**
 * 单元测试类RegistionServiceImpl
 * @author liuganchao<740033486@qq.com>
 * @date 2018年7月3日
 */
public class RegistionServiceImplTest extends AbstractUnitTestSupport{
	
	@Autowired
	private IRegistionService registionService;
	
	@Autowired
	private ICourseService courseService;
	
	private MockConfig mockConfig;
	
	
	@Before
	@Override
	public void setup() {
		super.setup();
		mockConfig = new MockConfig()
			    .byteRange((byte) 0, Byte.MAX_VALUE)
			    .shortRange((short) 0,(short) 2)
			    .intRange(100, 180)
			    .floatRange(0.0f, Float.MAX_EXPONENT)
			    .doubleRange(0.0, Double.MAX_VALUE)
			    .longRange(0, Long.MAX_VALUE)
			    .dateRange("2000-01-01", "2015-12-30")
			    .sizeRange(5, 10)
			    //.stringSeed("a", "b", "c")
			    .charSeed((char) 97, (char) 98);
		
	}

	@Test
	public void testQuery() {
		fail("Not yet implemented");
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testUpdate() {
		RegistionDto registionDto=JMockData.mock(RegistionDto.class,mockConfig);
		Registion entity=registionService.add(registionDto);
		registionDto.setId(entity.getId());
		registionDto.setPeriods(3);
		Registion dbEntitt=registionService.update(registionDto);
		assertTrue(dbEntitt!=null && dbEntitt.getPeriods()==3);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testAdd() {
		RegistionDto registionDto=JMockData.mock(RegistionDto.class,mockConfig);
		registionService.add(registionDto);
	}

	@Test
	public void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testGet() {
		
		RegistionDto registionDto=JMockData.mock(RegistionDto.class,mockConfig);
		Registion entity=registionService.add(registionDto);
		
		//创建课程,因为查询要关联课程
		Course course = JMockData.mock(Course.class, mockConfig);
		course.setId(entity.getCourseId());
		courseService.add(course);
				
				
		RegistionDto dbObject=registionService.get(entity.getId());
		assertNotNull(dbObject);
	}
	
	

}
