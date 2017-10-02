package ArticleBuilder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArticleBuilderTest {

	@Test
	public void ArticleBuildeTest() {
		Article article= new ArticleBuilder().id(3).reference("Article").stock(100).discontinued(true).build();
		assertEquals(3, article.getId());
	}

}
