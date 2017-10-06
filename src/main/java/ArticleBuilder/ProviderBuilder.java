package ArticleBuilder;

public class ProviderBuilder {


	private Provider provider;


	public ProviderBuilder() {

		provider = new Provider();
	}

	public ProviderBuilder id(int id) {
		provider.setId(id);
		return this;
	}

	public ProviderBuilder company(String company) {
		provider.setCompany(company);
		return this;
	}

	public ProviderBuilder adress(String adress) {
		provider.setAdress(adress);
		return this;
	}

	public Provider Build() {
		return this.provider;
	}

	

}
