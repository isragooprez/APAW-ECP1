package ArticleComposite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ArticleBuilder.Article;
import ArticleBuilder.ArticleBuilder;
import ArticleBuilder.Provider;
import ArticleBuilder.ProviderBuilder;
import ArticleComposite.ArticleComponent;
import ArticleComposite.ArticleComposite;
import ArticleComposite.ArticleLeaf;

public class ArticleCompositeTest {
	private Provider provider;
	private Article article1;
	private Article article2;
	private Article article3;
	private ArticleComponent periodico;
	private ArticleComponent revista;
	private ArticleComponent libro;
	private ArticleComponent articleLeaf;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void instancias() {
		this.provider = new ProviderBuilder().id(6).company("UPM").adress("Vallecas").Build();
		this.article1 = new ArticleBuilder().id(1).reference("Article1 MUERTE BLANCA").stock(21).discontinued(true)
				.provider(provider).Build();
		this.article2 = new ArticleBuilder().id(2).reference("Article2 MODA 80's ").stock(100).discontinued(true)
				.provider(provider).Build();
		this.article3 = new ArticleBuilder().id(3).reference("Article3 Vida NERUDA ").stock(500).discontinued(true)
				.provider(provider).Build();

	}

	@Test
	public void IdArticleLeaf() {
		this.articleLeaf = new ArticleLeaf(article1);
		articleLeaf.view();
		assertEquals("1", articleLeaf.view());

	}

	@Test
	public void NameGroupComposite() {
		this.periodico = new ArticleComposite("muerte blanca");
		this.articleLeaf = new ArticleLeaf(article1);
		this.periodico.add(articleLeaf);
		this.periodico.add(new ArticleLeaf(article1));
		assertEquals("muerte blanca", this.periodico.view());

		this.revista = new ArticleComposite("moda de los 80");
		articleLeaf = new ArticleLeaf(article2);
		this.revista.add(articleLeaf);
		assertEquals("moda de los 80", revista.view());

		this.libro = new ArticleComposite("Article Neruda");
		articleLeaf = new ArticleLeaf(article3);
		this.libro.add(articleLeaf);
		assertEquals("Article Neruda", libro.view());

	}


}
