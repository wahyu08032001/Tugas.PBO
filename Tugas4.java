
        public class DCInterface {
        public static void main(String[] args) {
        DCInterface main = new DCInterface();
        main.testCase();
        }

        public void testCase() {
        Product produksi = new Product("202", "Gucci","L","50.000");
        kategori Jaket1= new kategori("Bomber", "Parasut",produksi);
        kategori Jaket1= new kategori(Jaket.getJenisBarang(), Jaket.getJenisBahan(), produksi);


        Jaket1.setJenisBahan("Parasut");
        Jaket1.setJenisBarang("Bomber");


        System.out.println(produksi);
        System.out.println(Jaket);
        System.out.println(Jaket11);

        }

        }

        19  shallowcopy/src/DeepCopy.java
        @@ -0,0 +1,19 @@
        public class DeepCopy {

        public static void main(String[] args) {
        DeepCopy main2 = new DeepCopy();
        main2.DeepCopy_productCategories();
        }

        public void DeepCopy_productCategories() {
        Product produksi = new Product("202", "Gucci","L","50.000");
        kategori Jaket = new kategori("Bomber", "Parasut", produksi);
        kategori DeepCopy = (kategori) SerializationUtils.clone(Jaket);


        System.out.println(produksi);
        System.out.println(Jaket);

        }

        }
        public class SerializationUtils {
        private static Object kategori;

        public static Object clone(kategori jaket) {
        return jaket;
        }
        public Object clone() {
        try {
        return super.clone();
        } catch (CloneNotSupportedException e) {
        return kategori;
        }
        }
        }
        public class kategori {

        public String JenisBarang;
        public String JenisBahan;
        public Product PRODUKSI;

        public kategori(String jenisBarang, String jenisBahan, Product PRODUKSI) {
        JenisBarang = jenisBarang;
        JenisBahan = jenisBahan;
        this.PRODUKSI = PRODUKSI;
        }

        public String getJenisBarang() {
        return JenisBarang;
        }

        public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
        }

        public String getJenisBahan() {
        return JenisBahan;
        }

        public void setJenisBahan(String jenisBahan) {
        JenisBahan = jenisBahan;
        }

        public Product getPRODUKSI() {
        return PRODUKSI;
        }

        public void setPRODUKSI(Product PRODUKSI) {
        this.PRODUKSI = PRODUKSI;
        }

        @Override
        public String toString() {
        return "kategori{" +
        "JenisBarang='" + JenisBarang + '\'' +
        ", JenisBahan='" + JenisBahan + '\'' +
        ", PRODUKSI=" + PRODUKSI +
        '}';
        }
        }
        class Product {
        public String CodeBarang;
        public String MerkBarang;
        public String UkuranBarang;
        public String HargaBarang;

        public Product(String codeBarang, String merkBarang, String ukuranBarang, String hargaBarang) {
        CodeBarang = codeBarang;
        MerkBarang = merkBarang;
        UkuranBarang = ukuranBarang;
        HargaBarang = hargaBarang;
        }

        @Override
        public Object clone(){
        try {
        return super.clone();
        } catch (CloneNotSupportedException e) {
        return new Product(this.getCodeBarang(), this.getMerkBarang(),this.getUkuranBarang(),this.getHargaBarang());
        }
        }
        public String getCodeBarang() {
        return CodeBarang;
        }

        public void setCodeBarang(String codeBarang) {
        CodeBarang = codeBarang;
        }

        public String getMerkBarang() {
        return MerkBarang;
        }

        public void setMerkBarang(String merkBarang) {
        MerkBarang = merkBarang;
        }

        public String getUkuranBarang() {
        return UkuranBarang;
        }

        public void setUkuranBarang(String ukuranBarang) {
        UkuranBarang = ukuranBarang;
        }

        public String getHargaBarang() {
        return HargaBarang;
        }

        public void setHargaBarang(String hargaBarang) {
        HargaBarang = hargaBarang;
        }

        @Override
        public String toString() {
        return "Product{" +
        "CodeBarang='" + CodeBarang + '\'' +
        ", MerkBarang='" + MerkBarang + '\'' +
        ", UkuranBarang='" + UkuranBarang + '\'' +
        ", HargaBarang='" + HargaBarang + '\'' +
        '}';
        }
        }
