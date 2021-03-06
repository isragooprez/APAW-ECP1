package ArticleBuilder;

public class Article {

	private int id;
	private String reference;
	private long stock;
	private boolean discontinued;
	private Provider provider;

	public Article() {
		
	}

	public Article(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public boolean isDiscontinued() {
		return discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", reference=" + reference + ", stock=" + stock + ", discontinued=" + discontinued
				+ ", provider=" + provider + "]";
	}
	
	

}
