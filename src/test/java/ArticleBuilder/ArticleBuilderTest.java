package ArticleBuilder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArticleBuilderTest {

	@Test
	public void ArticleBuildeTest() {
		
		Provider provider= new ProviderBuilder().id(6).company("UPM").adress("Vallecas").Build();
		Article article= new ArticleBuilder().id(3).reference("Article").stock(100).discontinued(true).provider(provider).Build();
		assertEquals(3, article.getId());
	}

}
