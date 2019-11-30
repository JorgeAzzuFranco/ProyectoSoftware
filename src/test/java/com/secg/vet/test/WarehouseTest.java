package com.secg.vet.test;


import com.secg.vet.domain.Provider;
import com.secg.vet.domain.Warehouse;
import com.secg.vet.services.WarehouseService;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WarehouseTest {

    @Autowired
    WarehouseService warehouseService;

    @Test
    public void getAllProductsTest(){
        assertThat(warehouseService.listarProductos()).isNotEmpty();
    }

    @Test
    public void findOneProductTest() {
        AssertionsForClassTypes.assertThat(warehouseService.findOne(1)).isNotNull();
    }

    @Test
    public void getOneProductTest(){
        Warehouse product = new Warehouse();
        product.setSku("Test");
        product.setCantidad(10);
        product.setNombre_producto("Test");
        Provider provider = new Provider();
        provider.setPk_proveedor(1);
        product.setProvider(provider);
        warehouseService.insertProduct(product);
        assertThat(warehouseService.listarProductoSku("Test")).isNotNull();
        warehouseService.deleteProduct(warehouseService.listarProductoSku("Test"));
    }

    @Test
    public void insertOneProduct(){
        Warehouse product = new Warehouse();
        product.setSku("Test");
        product.setCantidad(10);
        product.setNombre_producto("Test");
        Provider provider = new Provider();
        provider.setPk_proveedor(1);
        product.setProvider(provider);
        warehouseService.insertProduct(product);
        assertThat(warehouseService.listarProductoSku("Test")).isNotNull();
        warehouseService.deleteProduct(warehouseService.listarProductoSku("Test"));
    }
    @Test
    public void deleteOneProduct(){
        Warehouse product = new Warehouse();
        product.setSku("Test");
        product.setCantidad(10);
        product.setNombre_producto("Test");
        Provider provider = new Provider();
        provider.setPk_proveedor(1);
        product.setProvider(provider);
        warehouseService.insertProduct(product);
        warehouseService.deleteProduct(warehouseService.listarProductoSku("Test"));
        assertThat(warehouseService.listarProductoSku("Test")).isNull();
    }

}
