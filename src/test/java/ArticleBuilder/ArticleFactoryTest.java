package ArticleBuilder;

import org.junit.Test;

import ArticleFactory.ArticleFactory;

public class ArticleFactoryTest {

	@Test
	public void testArticleFactory() {
		Provider provider= new ProviderBuilder().id(6).company("UPM").adress("Vallecas").Build();
		Article article= new ArticleBuilder().id(1).reference("Article1").stock(21).discontinued(true).provider(provider).Build();		
		ArticleFactory.getInstance().AddArticle(article);	
		Article result = ArticleFactory.getInstance().FindArticle(1);
		
		assert result != null;
		System.out.println("Encontrado");
	}

}
