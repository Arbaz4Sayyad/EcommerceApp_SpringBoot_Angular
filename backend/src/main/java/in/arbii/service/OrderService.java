package in.arbii.service;

import in.arbii.dto.PurchaseRequest;
import in.arbii.dto.PurchaseResponse;

public interface OrderService {

    public PurchaseResponse placeOrder(PurchaseRequest purchaseRequest) throws Exception;
}
