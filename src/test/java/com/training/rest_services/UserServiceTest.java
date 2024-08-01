package com.training.rest_services;

import com.training.rest_services.entity.User;
import com.training.rest_services.repo.UserRepository;
import com.training.rest_services.service.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveUser() {
        // Arrange
        User mockUser = new User();
        mockUser.setName("John Doe");
        mockUser.setEmail("johndoe@example.com");

        when(userRepository.save(any(User.class))).thenReturn(mockUser);

        // Act
        User savedUser = userService.saveUser(mockUser);

        // Assert
        assertNotNull(savedUser);
        assertEquals("John Doe", savedUser.getName());
        assertEquals("johndoe@example.com", savedUser.getEmail());
        verify(userRepository, times(1)).save(any(User.class));
    }
}