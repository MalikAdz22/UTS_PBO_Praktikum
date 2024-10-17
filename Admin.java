public // Kelas Admin (Subclass dari User)
class Admin extends User {
    // Constructor
    public Admin(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public void update_vehicle_details(int vehicle_id) {
        System.out.println("Detail kendaraan dengan ID " + vehicle_id + " telah diperbarui.");
    }

    public void add_vehicle(String vehicle) {
        System.out.println("Kendaraan baru " + vehicle + " berhasil ditambahkan.");
    }

    public void retrieve_complain() {
        System.out.println("Mengambil keluhan dari pelanggan...");
    }

  
    public void verify_user(Customer user) {
        if (user.get_verification_status()) {
            System.out.println("Pelanggan " + user.getName() + " telah diverifikasi.");
        } else {
            System.out.println("Pelanggan " + user.getName() + " belum diverifikasi.");
        }
    }
}
 

