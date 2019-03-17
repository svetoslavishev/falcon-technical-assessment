package com.ishev.bookstorerestapi.services.ebook;

import com.ishev.bookstorerestapi.models.EBook;
import com.ishev.bookstorerestapi.repositories.ebook.EBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EBookServiceImpl implements EBookService {

    private EBookRepository eBookRepository;

    @Autowired
    public EBookServiceImpl(EBookRepository eBookRepository) {
        this.eBookRepository = eBookRepository;
    }

    @Override
    public List<EBook> getAllEBooks() {
        return eBookRepository.getAllEBooks();
    }

    @Override
    public List<EBook> getAllEBooksByAuthorName(String authorName) {
        return eBookRepository.getAllEBooksByAuthorName(authorName);
    }

    @Override
    public List<EBook> getAllEBooksByTytle(String title) {
        return eBookRepository.getAllEBooksByTitle(title);
    }

    @Override
    public void updateEBookQuantity(int eBookId, int quantity) {
        eBookRepository.updateEBookQuantity(eBookId, quantity);
    }
}
