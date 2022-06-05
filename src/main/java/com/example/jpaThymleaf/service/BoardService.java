package com.example.jpaThymleaf.service;

import com.example.jpaThymleaf.model.Board;
import com.example.jpaThymleaf.model.User;
import com.example.jpaThymleaf.repository.BoardRepository;
import com.example.jpaThymleaf.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    private final UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        System.out.println("user.getUsername() = " + user.getUsername());
        board.setUser(user);
        return boardRepository.save(board);
    }
}
