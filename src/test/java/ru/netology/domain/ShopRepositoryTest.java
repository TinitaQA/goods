package ru.netology.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test
    public void shouldRemoveById() {
        ShopRepository shop = new ShopRepository();

        Product item1 = new Product(1, "Платье", 5_000);
        Product item2 = new Product(2, "Туфли", 7_000);

        shop.add(item1);
        shop.add(item2);

        shop.removeById(1);

        Product[] expected = { item2 };
        Product[] actual = shop.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByNotId() {
        ShopRepository shop = new ShopRepository();

        Product item1 = new Product(1, "Платье", 5_000);

        shop.add(item1);

        Assertions.assertThrows(NotFoundException.class, () -> {
            shop.removeById(2);
        });
    }
}