package com.playground.domain.repository;

import com.playground.domain.configuration.RootApplicationContextConfig;
import com.playground.domain.configuration.TestContextInitializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by coupang on 2017. 12. 24..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootApplicationContextConfig.class, initializers = TestContextInitializer.class)
public class WritingRepositoryTest {

	@Autowired
	private WritingRepository repository;

	@Test
	public void test_CRUD() {
		Writing writing = writingFixture();
		repository.save(writing);

		Writing result = repository.findOne(writing.getWritingId());
		assertNotNull(result);
		assertEquals(writing.getContent(), result.getContent());

		repository.delete(writing.getWritingId());

	}

	private Writing writingFixture() {
		Writing writing = new Writing();
		writing.setContent("");
		writing.setTitle("");
		writing.setCreatedAt(new Date());
		writing.setModifiedAt(new Date());
		return writing;
	}
}