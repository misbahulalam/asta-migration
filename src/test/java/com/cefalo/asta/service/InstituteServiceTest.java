package com.cefalo.asta.service;

import com.cefalo.asta.model.Institute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author <a href="mailto:misbahulalam@gmail.com">Md. Misbahul Alam Chowdhury</a> on Aug 31, 2017
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InstituteServiceTest {

    @Autowired
    private InstituteService instituteService;

    @Test
    public void testHavingInstitutes() {
        assertNotNull(instituteService);
        List<Institute> institutes = instituteService.listInstitutes();
        assertEquals(73, institutes.size());
    }

}
