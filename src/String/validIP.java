package String;

public class validIP {
    public static void main(String[] args) {
        String query = "172.16.254.1";
        System.out.println(validIPAddress(query));
    }

    public static String validIPAddress(String queryIP) {
        if (queryIP == null || queryIP.isEmpty()) {
            return "Neither";
        }

        if (queryIP.indexOf(".") >= 0) {
            return validIp4(queryIP);
        }
        if (queryIP.indexOf(":") >= 0) {
            return validIp6(queryIP);
        }

        return "Neither";
    }

    public static String validIp4(String str) {
        if (str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.') {
            return "Neither";
        }

        String[] parts = str.split("\\.");

        if (parts.length != 4) {
            return "Neither";
        }

        for (String part : parts) {
            // Check if the part is empty, longer than 3 characters, or has leading zeros
            if (part.isEmpty() || part.length() > 3 || (part.charAt(0) == '0' && part.length() > 1)) {
                return "Neither";
            }

            // Ensure that each character in the part is a digit
            for (char ch : part.toCharArray()) {
                if (ch < '0' || ch > '9') {
                    return "Neither";
                }
            }

            // Convert the part to an integer and check if it is in the range 0-255
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return "Neither";
            }
        }

        return "IPv4";
    }

    public static String validIp6(String str) {
        if (str.charAt(0) == ':' || str.charAt(str.length() - 1) == ':') {
            return "Neither";
        }

        // Split the string into parts
        String[] parts = str.split(":");

        // Check if there are exactly 8 parts
        if (parts.length != 8) {
            return "Neither";
        }

        // Iterate through each part
        for (String part : parts) {
            // Check for empty parts or parts longer than 4 characters
            if (part.isEmpty() || part.length() > 4) {
                return "Neither";
            }

            // Check for invalid characters (non-hexadecimal digits)
            for (char ch : part.toCharArray()) {
                if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'))) {
                    return "Neither";
                }
            }
        }

        // If all checks pass, it's a valid IPv6 address
        return "IPv6";
    }
}
