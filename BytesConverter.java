public class BytesConverter {

        public static void main(String[] args) {
            long totalBytes = 1811568855; // Input: any valid number of bytes

            long gigaBytes = totalBytes/(1024*1024*1024); // Your formula
            long megaBytes = (totalBytes/(1024*1024))-(gigaBytes*1024); // Your formula
            long kiloBytes = (totalBytes/(1024))-(gigaBytes)-(megaBytes*1024); // Your formula
            long bytes = totalBytes - (gigaBytes*1024*1024*1024)-(megaBytes*1024*1024)-(kiloBytes*1024); // Your formula

            System.out.println(gigaBytes + " GB, " + megaBytes + " MB, "
                    + kiloBytes + " KB, " + bytes + " B");
        }


    }
