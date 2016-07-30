package com.wind_now.aws_apa;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import am.ik.aws.apa.jaxws.ItemSearchResponse;

/**
 *
 * @author ono
 */
public class AwsApiTest {

	public AwsApiTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void itemSearch() {
		List<String> keywords = Arrays.asList("吹奏楽");
		Operation op = new Operation();
		ItemSearchResponse res = op.itemSearch(keywords);
		String actual = res.getItems().get(0).getRequest().getIsValid();
		String expected = "True";
		assertThat(actual, is(expected));
	}
	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
}
