module com.my.giftdesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.my.giftdesktop to javafx.fxml;
    exports com.my.giftdesktop;
}