import hu.ltk.jakabgabor.store.register.domain.SlimStoreRegister;
import hu.ltk.jakabgabor.ui.StorageUi;

import java.util.Scanner;

public class StorageUiMain {
    public static void main(String[] args) {
        StorageUi storageUi = new StorageUi(new Scanner(System.in), new SlimStoreRegister());

        storageUi.run();
    }
}
