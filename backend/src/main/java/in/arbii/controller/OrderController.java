package in.arbii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.arbii.dto.PurchaseRequest;
import in.arbii.dto.PurchaseResponse;
import in.arbii.service.OrderService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/purchase")
    public PurchaseResponse createOrder(@RequestBody PurchaseRequest purchaseRequest) throws Exception {
        return orderService.placeOrder(purchaseRequest);
    }
}
