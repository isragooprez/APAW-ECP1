package ArticleFactory;

import java.util.HashMap;
import java.util.Map;

import ArticleBuilder.Article;

public class ArticleFactory {

	private static ArticleFactory articleFactory;

	private Map<Integer, Article> references;
	private int reference;

	private ArticleFactory() {

		this.references = new HashMap<>();
		this.reference = 0;
	}

	public static ArticleFactory getInstance() {
		if (articleFactory == null) {
			articleFactory = new ArticleFactory();
		}
		return articleFactory;
	}

	public void AddArticle(Article article) {
		references.put(article.getId(),article);
	}

	public void RemoveArticle(int key) {
		references.remove(key);
	}

	public Article FindArticle(int key) {
		return references.get(key);
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

}
