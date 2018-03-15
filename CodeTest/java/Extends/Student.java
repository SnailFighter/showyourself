class Student extends Person {
	private String name;

	private int grade;

	public String getName(){return name;}
 
	public void setName(String name){this.name = name;}


	public int getGrade(){return grade;}
 
	public void setGrade(int grade){this.grade = grade;}


	 @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student that = (Student) o;

        boolean ok = name != null ? name.equals(that.name) : that.name == null;

        System.out.println("------------"+ok);

        return ok;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}