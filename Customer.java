// Kelas Customer (Subclass dari User)
class Customer extends User {
    private boolean verification_status = false; 

    public Customer(int user_id, String password, String name, int age, String email_id, String doc) {
        super(user_id, password, name, age, email_id, doc);
    }

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String doc) {
        if (doc.equals("jpg") || doc.equals("png") || doc.equals("pdf")) {
            verification_status = true;
            System.out.println("Dokumen terverifikasi.");
        } else {
            System.out.println("Format dokumen tidak didukung.");
        }
    }
}

