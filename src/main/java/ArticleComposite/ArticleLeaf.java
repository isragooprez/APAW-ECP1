package ArticleComposite;

import ArticleBuilder.Article;

public class ArticleLeaf extends ArticleComponent {
	private Article article;

	public ArticleLeaf(Article article) {
		this.article = article;
	}
	

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "" + article.getId() + "";
	}

	@Override
	public String view() {
		return toString();
	}

	@Override
	public void add(ArticleComponent articleComponent) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

}
