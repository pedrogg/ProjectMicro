package rw.store.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rw.store.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
