use billingsystem;
CREATE TABLE dish (
    d_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(6,2) NOT NULL,
    description VARCHAR(255)
);

INSERT INTO dish (name, price, description) VALUES
('Chicken Dum Biryani', 220.00, 'Traditional slow-cooked chicken dum biryani'),
('Hyderabadi Chicken Biryani', 240.00, 'Spicy Hyderabadi style chicken biryani'),
('Mutton Biryani', 320.00, 'Aromatic basmati rice with tender mutton'),
('Hyderabadi Mutton Biryani', 350.00, 'Authentic Hyderabadi dum mutton biryani'),
('Egg Biryani', 180.00, 'Boiled eggs cooked with biryani spices'),
('Chicken Fry Piece Biryani', 260.00, 'Fried chicken pieces mixed with biryani rice'),
('Chicken 65 Biryani', 270.00, 'Spicy Chicken 65 layered with biryani'),
('Chicken Tikka Biryani', 280.00, 'Grilled chicken tikka mixed with biryani'),
('Chicken Lollipop Biryani', 290.00, 'Crispy chicken lollipop biryani'),
('Boneless Chicken Biryani', 300.00, 'Boneless chicken biryani for easy eating'),
('Kolkata Chicken Biryani', 250.00, 'Mildly spiced Kolkata-style biryani'),
('Ambur Chicken Biryani', 240.00, 'Tamil Nadu Ambur style biryani'),
('Donne Chicken Biryani', 260.00, 'Karnataka Donne style chicken biryani'),
('Fish Biryani', 280.00, 'Fish pieces cooked with aromatic rice'),
('Prawn Biryani', 340.00, 'Juicy prawns cooked in rich biryani masala'),
('Keema Biryani', 310.00, 'Minced meat biryani with spices'),
('Paneer Biryani', 200.00, 'Paneer cubes cooked with biryani rice'),
('Veg Dum Biryani', 190.00, 'Mixed vegetables slow-cooked dum biryani'),
('Mushroom Biryani', 210.00, 'Fresh mushrooms cooked with basmati rice'),
('Kaju Biryani', 230.00, 'Cashew-based rich vegetarian biryani'),
('Mixed Veg Biryani', 180.00, 'Assorted vegetables with mild spices'),
('Soya Chunk Biryani', 170.00, 'Protein-rich soya chunks biryani'),
('Jackfruit Biryani', 220.00, 'Raw jackfruit used as meat substitute'),
('Afghani Chicken Biryani', 300.00, 'Creamy Afghani-style chicken biryani'),
('Special Royal Biryani', 380.00, 'Premium biryani with rich ingredients');

select * from dish;