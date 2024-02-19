package dev.joaor.movies.domain.user;

public record RegisterDTO(String login, String password, UserRoles role) {
}
