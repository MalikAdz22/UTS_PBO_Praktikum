// Kelas User (Subclass dari UserProfile)
class User extends UserProfile {
  
    public User(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }


    public boolean log_in(int user_id, String password) {
        if (this.user_id == user_id && this.password.equals(password)) {
            System.out.println("Login berhasil!");
            return true;
        } else {
            System.out.println("Login gagal! ID pengguna atau kata sandi salah.");
            return false;
        }
    }


    public void recover_password() {
        System.out.println("Pemulihan kata sandi terkirim ke " + email_id);
    }

 
    public void log_out() {
        System.out.println("Pengguna " + name + " telah logout.");
    }
}

