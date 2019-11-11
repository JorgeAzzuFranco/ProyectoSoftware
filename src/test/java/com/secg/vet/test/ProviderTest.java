package com.secg.vet.test;

import com.secg.vet.domain.Provider;
import com.secg.vet.services.ProviderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderTest {

    @Autowired
    ProviderService providerService;

    @Test
    public void findAllProviderTest() {
        assertThat(providerService.findAll()).isNotNull();
    }

    @Test
    public void findOneProviderTest() {
        assertThat(providerService.findOne(1)).isNotNull();
    }

    @Test
    public void findByNameProviderTest() {
        assertThat(providerService.findByName("Almacenes Don Chepe")).isNotNull();
    }

    @Test
    public void createOrUpdateProviderTest() {
        Provider test = new Provider("test1","test1", "55555555");
        providerService.createOrUpdate(test);
        assertThat(providerService.findByName("test1")).isNotNull();
        providerService.delete(test);
    }

    @Test
    public void deleteProviderTest() {
        Provider test = new Provider("test1","test1", "55555555");
        providerService.createOrUpdate(test);
        providerService.delete(test);
        assertThat(providerService.findByName("test1")).isNull();
    }
}
