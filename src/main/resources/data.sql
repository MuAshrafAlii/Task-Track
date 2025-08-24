INSERT INTO todo (id, username, description, target_date, is_done)
VALUES
    (101, 'mido', 'Learn new', CURRENT_DATE(), false),
    (102, 'mido', 'Practice Spring Boot', CURRENT_DATE(), false),
    (103, 'mido', 'Write SQL queries', CURRENT_DATE() + 1, false),
    (104, 'alex', 'Read about security config', CURRENT_DATE() + 2, false),
    (105, 'sara', 'Explore H2 console', CURRENT_DATE(), true);