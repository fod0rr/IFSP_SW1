package crudUsuario.model;

public class Emp 
{
	//Pedro Xavier Oliveira e Maria Eduarda Fodor
	
	private int id;
	private String name, password, email;
	
	public int getId() 
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
}
