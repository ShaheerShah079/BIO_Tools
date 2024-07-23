<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Bio Tools App</h1>
    <p>This Android application provides several bioinformatics tools including Transcription, Translation, Palindrome detection, Open Reading Frame identification, GC Content calculation, Splicing, Global Alignment, Local Alignment, and Dot Plot matrix visualization. The app is designed to be user-friendly and accessible for those working in the field of bioinformatics.</p>
<h2>Table of Contents</h2>
    <ul>
        <li><a href="#main-screen">Main Screen</a></li>
        <li><a href="#transcription-screen">Transcription Screen</a></li>
        <li><a href="#translation-screen">Translation Screen</a></li>
        <li><a href="#splicing-screen">Splicing Screen</a></li>
        <li><a href="#global-alignment-screen">Global Alignment Screen</a></li>
        <li><a href="#local-alignment-screen">Local Alignment Screen</a></li>
        <li><a href="#dot-plot-screen">Dot Plot Screen</a></li>
        <li><a href="#open-reading-frame-screen">Open Reading Frame Screen</a></li>
        <li><a href="#gc-content-screen">GC Content Screen</a></li>
        <li><a href="#palindrome-screen">Palindrome Screen</a></li>
    </ul>

<h2 id="main-screen">Main Screen</h2>
<p>The main screen provides buttons for navigating to each of the bioinformatics tools available in the app. Each button is clearly labeled and opens the respective screen for the selected tool.</p>

<h2 id="transcription-screen">Transcription Screen</h2>
    <p>The Transcription screen allows users to input a DNA sequence and obtain the corresponding RNA sequence by replacing thymine (T) with uracil (U). The input is provided through an <code>EditText</code> field and the result is displayed in a <code>TextView</code>.</p>

<h2 id="translation-screen">Translation Screen</h2>
    <p>The Translation screen converts a DNA sequence into its corresponding protein sequence. Users can enter the DNA sequence in an <code>EditText</code> field. The app then translates the sequence into a protein sequence using the standard genetic code, and displays the result in a <code>TextView</code>.</p>

<h2 id="splicing-screen">Splicing Screen</h2>
<p>The Splicing screen simulates the biological process of RNA splicing. Users input a DNA sequence with introns, and the app removes the introns and concatenates the exons to form the mature mRNA sequence.</p>

<h2 id="global-alignment-screen">Global Alignment Screen</h2>
<p>The Global Alignment screen performs a global alignment of two DNA sequences using the Needleman-Wunsch algorithm. Users can input two DNA sequences,with the score of match mismatch and gap and the app will display the aligned sequences with scoring.</p>

<h2 id="local-alignment-screen">Local Alignment Screen</h2>
<p>The Local Alignment screen performs a local alignment of two DNA sequences using the Smith-Waterman algorithm. This is useful for finding the most similar subsequences within the two Dna input sequences.</p>

<h2 id="dot-plot-screen">Dot Plot Screen</h2>
<p>The Dot Plot screen generates a dot plot matrix to visually compare two DNA sequences. This helps in identifying regions of similarity between the sequences. Users can input the Dna sequences and view the resulting plot.</p>

<h2 id="open-reading-frame-screen">Open Reading Frame Screen</h2>
<p>The Open Reading Frame (ORF) screen identifies all possible ORFs within a DNA sequence. Users can input a DNA sequence, and the app will display the start and stop codons for each ORF.</p>

<h2 id="gc-content-screen">GC Content Screen</h2>
<p>The GC Content screen calculates the percentage of guanine (G) and cytosine (C) content in a given DNA sequence. Users can input their sequence, and the app will provide the GC content percentage.</p>

<h2 id="palindrome-screen">Palindrome Screen</h2>
<p>The Palindrome screen detects palindromic sequences within a DNA strand. Palindromic sequences are those that read the same backward as forward. The user inputs a DNA sequence, and the app highlights the palindromic regions.</p>

</body>
</html>
