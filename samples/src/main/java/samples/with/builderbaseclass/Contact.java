package samples.with.builderbaseclass;

import java.beans.ConstructorProperties;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder(withBaseclass = BaseBuilder.class)
public class Contact {
	private final String name;
	private String email;

	@ConstructorProperties({ "name" })
	public Contact(String aName) {
		this.name = aName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Contact: name=" + name + ", email=" + email;
	}
}
