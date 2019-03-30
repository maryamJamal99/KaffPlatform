package Classes;

public class Query {
	private String queryName; 
	private String querySyntax;
	
	public Query(String name, String query) {
		queryName = name;
		querySyntax = query;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public void setQuerySyntax(String querySyntax) {
		this.querySyntax = querySyntax;
	}

	public String getQueryName() {
		return queryName;
	}

	public String getQuerySyntax() {
		return querySyntax;
	}
	
	public String toString(){
		return queryName +": " + querySyntax;
	}
}
