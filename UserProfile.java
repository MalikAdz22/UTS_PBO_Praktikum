// Kelas UserProfile (Superclass)
class UserProfile {
    protected int user_id;     
    protected String password;      
    protected String name;        
    protected int age;           
    protected String email_id;   
    protected String doc;          

    // Constructor
    public UserProfile(int user_id, String password, String name, int age, String email_id, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        this.doc = doc;
    }

  
    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

   
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email_id;
    }


    public void edit_profile(String name, int age, String email_id) {
        this.name = name;
        this.age = age;
        this.email_id = email_id;
        System.out.println("Profil berhasil diperbarui.");
    }


    public void show_documents() {
        System.out.println("Dokumen pengguna: " + doc);
    }
}
