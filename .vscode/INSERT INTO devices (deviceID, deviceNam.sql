INSERT INTO devices (deviceID, deviceName, price)
VALUES (
        'deviceID:int',
        'deviceName:varchar',
        'price: DECIMAL'
    );
INSERT INTO stock (deviceID, quantity, totalPrice)
VALUES (
        'deviceID:int',
        'quantity:int',
        'totalPrice:decimal'
    );