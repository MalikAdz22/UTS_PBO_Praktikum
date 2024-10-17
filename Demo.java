import java.util.Scanner;

// Kelas utama untuk menjalankan program
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Customer dan Admin
        Customer customer = new Customer(101, "zz2210", "malik", 25, "malik@example.com", "jpg");
        Admin admin = new Admin(200, "adminpass", "malik", 25, "malik@example.com", "pdf");

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Login sebagai Customer");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Menangkap newline setelah nextInt

            if (menu == 1) {
                System.out.print("Masukkan ID Pengguna: ");
                int userId = scanner.nextInt();
                System.out.print("Masukkan Kata Sandi: ");
                String password = scanner.next();
                if (customer.log_in(userId, password)) {
                    // Menu Customer
                    while (true) {
                        System.out.println("\n=== Menu Customer ===");
                        System.out.println("1. Ajukan Verifikasi");
                        System.out.println("2. Logout");
                        System.out.print("Pilih menu: ");
                        int customerMenu = scanner.nextInt();

                        if (customerMenu == 1) {
                            System.out.print("Masukkan dokumen (jpg/png/pdf): ");
                            String doc = scanner.next();
                            customer.apply_verification(doc);
                        } else if (customerMenu == 2) {
                            customer.log_out();
                            break; // Kembali ke menu utama
                        } else {
                            System.out.println("Menu tidak valid!");
                        }
                    }
                }

            } else if (menu == 2) {
                System.out.print("Masukkan ID Admin: ");
                int adminId = scanner.nextInt();
                System.out.print("Masukkan Kata Sandi: ");
                String password = scanner.next();
                if (admin.log_in(adminId, password)) {
                    // Menu Admin
                    while (true) {
                        System.out.println("\n=== Menu Admin ===");
                        System.out.println("1. Verifikasi Pelanggan");
                        System.out.println("2. Tambah Kendaraan");
                        System.out.println("3. Logout");
                        System.out.print("Pilih menu: ");
                        int adminMenu = scanner.nextInt();

                        if (adminMenu == 1) {
                            admin.verify_user(customer);
                        } else if (adminMenu == 2) {
                            System.out.print("Masukkan nama kendaraan: ");
                            String vehicleName = scanner.next();
                            admin.add_vehicle(vehicleName);
                        } else if (adminMenu == 3) {
                            admin.log_out();
                            break; // Kembali ke menu utama
                        } else {
                            System.out.println("Menu tidak valid!");
                        }
                    }
                }

            } else if (menu == 3) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
        scanner.close();
    }
}
