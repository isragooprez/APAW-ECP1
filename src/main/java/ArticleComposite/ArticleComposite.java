package ArticleComposite;

import java.util.ArrayList;
import java.util.List;

public class ArticleComposite extends ArticleComponent {
	private List<ArticleComponent> listaArticleComponente;
	private String name;

	public ArticleComposite(String name) {
		this.name = name;
		listaArticleComponente = new ArrayList<>();
	}

	@Override
	public void add(ArticleComponent articleComponent) {
		assert articleComponent != null;
		listaArticleComponente.add(articleComponent);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String view() {
		return toString();
	}

	@Override
	public String toString() {
		return getName();
	}

}
